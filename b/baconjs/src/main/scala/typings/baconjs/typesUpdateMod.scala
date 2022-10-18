package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateMod {
  
  @JSImport("baconjs/types/update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def update[Out](initial: Out, patterns: UpdatePattern[Out]*): Property[Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(scala.List(initial.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Property[Out]]
  
  type UpdatePattern[O] = (UpdatePattern1[Any, O]) | (UpdatePattern2[Any, Any, O]) | (UpdatePattern3[Any, Any, Any, O]) | (UpdatePattern4[Any, Any, Any, Any, O]) | (UpdatePattern5[Any, Any, Any, Any, Any, O]) | (UpdatePattern6[Any, Any, Any, Any, Any, Any, O])
  
  type UpdatePattern1[I1, O] = js.Tuple2[default[I1], O | (js.Function2[/* acc */ O, /* a */ I1, O])]
  
  type UpdatePattern2[I1, I2, O] = js.Tuple3[default[I1], default[I1], O | (js.Function3[/* acc */ O, /* a */ I1, /* b */ I2, O])]
  
  type UpdatePattern3[I1, I2, I3, O] = js.Tuple4[
    default[I1], 
    default[I1], 
    default[I3], 
    O | (js.Function4[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, O])
  ]
  
  type UpdatePattern4[I1, I2, I3, I4, O] = js.Tuple5[
    default[I1], 
    default[I1], 
    default[I3], 
    default[I4], 
    O | (js.Function5[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, O])
  ]
  
  type UpdatePattern5[I1, I2, I3, I4, I5, O] = js.Tuple6[
    default[I1], 
    default[I1], 
    default[I3], 
    default[I4], 
    default[I5], 
    O | (js.Function6[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, O])
  ]
  
  type UpdatePattern6[I1, I2, I3, I4, I5, I6, O] = js.Tuple7[
    default[I1], 
    default[I1], 
    default[I3], 
    default[I4], 
    default[I5], 
    default[I6], 
    O | (js.Function7[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, /* f */ I6, O])
  ]
}
