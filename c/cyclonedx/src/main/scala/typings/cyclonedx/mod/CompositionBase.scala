package typings.cyclonedx.mod

import typings.cyclonedx.cyclonedxStrings.complete
import typings.cyclonedx.cyclonedxStrings.incomplete
import typings.cyclonedx.cyclonedxStrings.incomplete_first_party_only
import typings.cyclonedx.cyclonedxStrings.incomplete_third_party_only
import typings.cyclonedx.cyclonedxStrings.not_specified
import typings.cyclonedx.cyclonedxStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionBase extends StObject {
  
  var aggregate: complete | incomplete | incomplete_first_party_only | incomplete_third_party_only | unknown | not_specified
  
  var assemblies: js.UndefOr[js.Array[String]] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
}
object CompositionBase {
  
  inline def apply(
    aggregate: complete | incomplete | incomplete_first_party_only | incomplete_third_party_only | unknown | not_specified
  ): CompositionBase = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionBase] (val x: Self) extends AnyVal {
    
    inline def setAggregate(
      value: complete | incomplete | incomplete_first_party_only | incomplete_third_party_only | unknown | not_specified
    ): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAssemblies(value: js.Array[String]): Self = StObject.set(x, "assemblies", value.asInstanceOf[js.Any])
    
    inline def setAssembliesUndefined: Self = StObject.set(x, "assemblies", js.undefined)
    
    inline def setAssembliesVarargs(value: String*): Self = StObject.set(x, "assemblies", js.Array(value*))
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
  }
}
