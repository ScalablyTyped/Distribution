package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputResources extends StObject {
  
  /**
    * The EC2 AMIs created by this image. 
    */
  var amis: js.UndefOr[AmiList] = js.native
}
object OutputResources {
  
  @scala.inline
  def apply(): OutputResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputResources]
  }
  
  @scala.inline
  implicit class OutputResourcesMutableBuilder[Self <: OutputResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmis(value: AmiList): Self = StObject.set(x, "amis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmisUndefined: Self = StObject.set(x, "amis", js.undefined)
    
    @scala.inline
    def setAmisVarargs(value: Ami*): Self = StObject.set(x, "amis", js.Array(value :_*))
  }
}
