package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypefaceFontProviderFactory extends StObject {
  
  /**
    * Return an empty TypefaceFontProvider
    */
  def Make(): TypefaceFontProvider = js.native
}
object TypefaceFontProviderFactory {
  
  @scala.inline
  def apply(Make: () => TypefaceFontProvider): TypefaceFontProviderFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction0(Make))
    __obj.asInstanceOf[TypefaceFontProviderFactory]
  }
  
  @scala.inline
  implicit class TypefaceFontProviderFactoryMutableBuilder[Self <: TypefaceFontProviderFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMake(value: () => TypefaceFontProvider): Self = StObject.set(x, "Make", js.Any.fromFunction0(value))
  }
}
