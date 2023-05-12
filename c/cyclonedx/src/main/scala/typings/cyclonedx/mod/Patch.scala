package typings.cyclonedx.mod

import typings.cyclonedx.anon.Description
import typings.cyclonedx.anon.Url
import typings.cyclonedx.cyclonedxStrings.`cherry-pick`
import typings.cyclonedx.cyclonedxStrings.backport
import typings.cyclonedx.cyclonedxStrings.monkey
import typings.cyclonedx.cyclonedxStrings.unofficial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  var diff: js.UndefOr[Url] = js.undefined
  
  var resolves: js.UndefOr[js.Array[Description]] = js.undefined
  
  var `type`: unofficial | monkey | backport | `cherry-pick`
}
object Patch {
  
  inline def apply(`type`: unofficial | monkey | backport | `cherry-pick`): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
    
    inline def setDiff(value: Url): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
    
    inline def setResolves(value: js.Array[Description]): Self = StObject.set(x, "resolves", value.asInstanceOf[js.Any])
    
    inline def setResolvesUndefined: Self = StObject.set(x, "resolves", js.undefined)
    
    inline def setResolvesVarargs(value: Description*): Self = StObject.set(x, "resolves", js.Array(value*))
    
    inline def setType(value: unofficial | monkey | backport | `cherry-pick`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
