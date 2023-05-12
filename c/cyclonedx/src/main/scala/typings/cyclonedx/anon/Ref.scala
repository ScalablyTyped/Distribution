package typings.cyclonedx.anon

import typings.cyclonedx.mod.BomRef
import typings.cyclonedx.mod.VersionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: BomRef
  
  var versions: js.UndefOr[js.Array[VersionRange & Status]] = js.undefined
}
object Ref {
  
  inline def apply(ref: BomRef): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    inline def setRef(value: BomRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: js.Array[VersionRange & Status]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: (VersionRange & Status)*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
