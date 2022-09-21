package typings.bigRat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(number: Double): Rat = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[Rat]
  inline def apply(number: Double, denom: Double): Rat = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], denom.asInstanceOf[js.Any])).asInstanceOf[Rat]
  
  @JSImport("big-rat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Rat = js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
  ]
}
