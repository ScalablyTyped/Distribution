package typings.cyclonedx.anon

import typings.cyclonedx.cyclonedxStrings.complete
import typings.cyclonedx.cyclonedxStrings.incomplete
import typings.cyclonedx.cyclonedxStrings.incomplete_first_party_only
import typings.cyclonedx.cyclonedxStrings.incomplete_third_party_only
import typings.cyclonedx.cyclonedxStrings.not_specified
import typings.cyclonedx.cyclonedxStrings.unknown
import typings.cyclonedx.mod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cyclonedx.cyclonedx.CompositionBase & {  signature :cyclonedx.cyclonedx.Signature | undefined} */
trait CompositionBasesignatureS extends StObject {
  
  var aggregate: complete | incomplete | incomplete_first_party_only | incomplete_third_party_only | unknown | not_specified
  
  var assemblies: js.UndefOr[js.Array[String]] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var signature: js.UndefOr[Signature] = js.undefined
}
object CompositionBasesignatureS {
  
  inline def apply(
    aggregate: complete | incomplete | incomplete_first_party_only | incomplete_third_party_only | unknown | not_specified
  ): CompositionBasesignatureS = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionBasesignatureS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionBasesignatureS] (val x: Self) extends AnyVal {
    
    inline def setAggregate(
      value: complete | incomplete | incomplete_first_party_only | incomplete_third_party_only | unknown | not_specified
    ): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAssemblies(value: js.Array[String]): Self = StObject.set(x, "assemblies", value.asInstanceOf[js.Any])
    
    inline def setAssembliesUndefined: Self = StObject.set(x, "assemblies", js.undefined)
    
    inline def setAssembliesVarargs(value: String*): Self = StObject.set(x, "assemblies", js.Array(value*))
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
