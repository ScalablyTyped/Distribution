package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertFirst extends StObject {
  
  var insertFirst: js.UndefOr[Boolean] = js.native
  
  var mask: js.UndefOr[Double] = js.native
  
  var scope: js.UndefOr[js.Any] = js.native
}
object InsertFirst {
  
  @scala.inline
  def apply(): InsertFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertFirst]
  }
  
  @scala.inline
  implicit class InsertFirstMutableBuilder[Self <: InsertFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    @scala.inline
    def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
