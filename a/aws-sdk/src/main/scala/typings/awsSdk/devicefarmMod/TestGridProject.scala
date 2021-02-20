package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestGridProject extends StObject {
  
  /**
    * The ARN for the project.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.native
  
  /**
    * When the project was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  
  /**
    * A human-readable description for the project.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A human-readable name for the project.
    */
  var name: js.UndefOr[String] = js.native
}
object TestGridProject {
  
  @scala.inline
  def apply(): TestGridProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridProject]
  }
  
  @scala.inline
  implicit class TestGridProjectMutableBuilder[Self <: TestGridProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: DeviceFarmArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
