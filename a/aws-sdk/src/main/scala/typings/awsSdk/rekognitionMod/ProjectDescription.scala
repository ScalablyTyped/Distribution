package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectDescription extends StObject {
  
  /**
    * The Unix timestamp for the date and time that the project was created.
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectArn] = js.undefined
  
  /**
    * The current status of the project.
    */
  var Status: js.UndefOr[ProjectStatus] = js.undefined
}
object ProjectDescription {
  
  inline def apply(): ProjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDescription]
  }
  
  extension [Self <: ProjectDescription](x: Self) {
    
    inline def setCreationTimestamp(value: DateTime): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
    
    inline def setStatus(value: ProjectStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
