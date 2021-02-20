package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Builder extends StObject {
  
  /**
    * The ARN of the builder.
    */
  var ARN: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ARN] = js.native
}
object Builder {
  
  @scala.inline
  def apply(): Builder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Builder]
  }
  
  @scala.inline
  implicit class BuilderMutableBuilder[Self <: Builder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
  }
}
