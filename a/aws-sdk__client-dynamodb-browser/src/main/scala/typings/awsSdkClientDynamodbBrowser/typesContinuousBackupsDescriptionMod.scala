package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
import typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod.UnmarshalledPointInTimeRecoveryDescription
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
        typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
      ] = js.undefined
  }
  object ContinuousBackupsDescription {
    
    inline def apply(ContinuousBackupsStatus: ENABLED | DISABLED | String): ContinuousBackupsDescription = {
      val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuousBackupsDescription]
    }
    
    extension [Self <: ContinuousBackupsDescription](x: Self) {
      
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
    
    extension [Self <: UnmarshalledContinuousBackupsDescription](x: Self) {
      
      inline def setPointInTimeRecoveryDescription(value: UnmarshalledPointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
    }
  }
}
