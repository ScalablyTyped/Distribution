package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
import typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.UnmarshalledPointInTimeRecoveryDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContinuousBackupsDescriptionMod {
  
  @js.native
  trait ContinuousBackupsDescription extends StObject {
    
    /**
      * <p> <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED</p>
      */
    var ContinuousBackupsStatus: ENABLED | DISABLED | String = js.native
    
    /**
      * <p>The description of the point in time recovery settings applied to the table.</p>
      */
    var PointInTimeRecoveryDescription: js.UndefOr[
        typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
      ] = js.native
  }
  object ContinuousBackupsDescription {
    
    @scala.inline
    def apply(ContinuousBackupsStatus: ENABLED | DISABLED | String): ContinuousBackupsDescription = {
      val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuousBackupsDescription]
    }
    
    @scala.inline
    implicit class ContinuousBackupsDescriptionMutableBuilder[Self <: ContinuousBackupsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuousBackupsStatus(value: ENABLED | DISABLED | String): Self = StObject.set(x, "ContinuousBackupsStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledContinuousBackupsDescription extends ContinuousBackupsDescription {
    
    /**
      * <p>The description of the point in time recovery settings applied to the table.</p>
      */
    @JSName("PointInTimeRecoveryDescription")
    var PointInTimeRecoveryDescription_UnmarshalledContinuousBackupsDescription: js.UndefOr[UnmarshalledPointInTimeRecoveryDescription] = js.native
  }
  object UnmarshalledContinuousBackupsDescription {
    
    @scala.inline
    def apply(ContinuousBackupsStatus: ENABLED | DISABLED | String): UnmarshalledContinuousBackupsDescription = {
      val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledContinuousBackupsDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledContinuousBackupsDescriptionMutableBuilder[Self <: UnmarshalledContinuousBackupsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointInTimeRecoveryDescription(value: UnmarshalledPointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
    }
  }
}
