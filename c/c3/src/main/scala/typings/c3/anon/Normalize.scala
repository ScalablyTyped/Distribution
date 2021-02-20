package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Normalize extends StObject {
  
  /**
    * Set the stacking to be normalized. Default is false.
    *
    * **Note**: For stacking, the `data.groups` option should be set and have positive values. The yAxis will be set in percentage value (0 ~ 100%).
    */
  var normalize: js.UndefOr[Boolean] = js.native
}
object Normalize {
  
  @scala.inline
  def apply(): Normalize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Normalize]
  }
  
  @scala.inline
  implicit class NormalizeMutableBuilder[Self <: Normalize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
  }
}
