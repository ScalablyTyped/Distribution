package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRobotApplicationVersionRequest extends StObject {
  
  /**
    * The application information for the robot application.
    */
  var application: Arn
  
  /**
    * The current revision id for the robot application. If you provide a value and it matches the latest revision ID, a new version will be created.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
}
object CreateRobotApplicationVersionRequest {
  
  inline def apply(application: Arn): CreateRobotApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationVersionRequest]
  }
  
  extension [Self <: CreateRobotApplicationVersionRequest](x: Self) {
    
    inline def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionId(value: RevisionId): Self = StObject.set(x, "currentRevisionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionIdUndefined: Self = StObject.set(x, "currentRevisionId", js.undefined)
  }
}
