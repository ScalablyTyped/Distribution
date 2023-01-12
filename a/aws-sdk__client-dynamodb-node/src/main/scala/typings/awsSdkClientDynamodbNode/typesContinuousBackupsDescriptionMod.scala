package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
import typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.UnmarshalledPointInTimeRecoveryDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContinuousBackupsDescriptionMod {
  
  trait ContinuousBackupsDescription extends StObject {
    
    /**
      * <p> <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED</p>
      */
    var ContinuousBackupsStatus: ENABLED | DISABLED | String
    
    /**
      * <p>The description of the point in time recovery settings applied to the table.</p>
      */
    var PointInTimeRecoveryDescription: js.UndefOr[
        typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
      ] = js.undefined
  }
  object ContinuousBackupsDescription {
    
    inline def apply(ContinuousBackupsStatus: ENABLED | DISABLED | String): ContinuousBackupsDescription = {
      val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuousBackupsDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContinuousBackupsDescription] (val x: Self) extends AnyVal {
      
      inline def setContinuousBackupsStatus(value: ENABLED | DISABLED | String): Self = StObject.set(x, "ContinuousBackupsStatus", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
    }
  }
  
  trait UnmarshalledContinuousBackupsDescription
    extends StObject
       with ContinuousBackupsDescription {
    
    /**
      * <p>The description of the point in time recovery settings applied to the table.</p>
      */
    @JSName("PointInTimeRecoveryDescription")
    var PointInTimeRecoveryDescription_UnmarshalledContinuousBackupsDescription: js.UndefOr[UnmarshalledPointInTimeRecoveryDescription] = js.undefined
  }
  object UnmarshalledContinuousBackupsDescription {
    
    inline def apply(ContinuousBackupsStatus: ENABLED | DISABLED | String): UnmarshalledContinuousBackupsDescription = {
      val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledContinuousBackupsDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledContinuousBackupsDescription] (val x: Self) extends AnyVal {
      
      inline def setPointInTimeRecoveryDescription(value: UnmarshalledPointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
    }
  }
}
