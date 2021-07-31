package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageContext extends StObject {
  
  /**
    * The name of the stage.
    */
  var name: js.UndefOr[StageName] = js.undefined
}
object StageContext {
  
  @scala.inline
  def apply(): StageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageContext]
  }
  
  @scala.inline
  implicit class StageContextMutableBuilder[Self <: StageContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
