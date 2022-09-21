package typings.clownface

import typings.clownface.mod.FilterCallback
import typings.rdfjsTypes.dataModelMod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("clownface/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("clownface/filter", "taggedLiteral")
  @js.native
  def taggedLiteral: js.Function1[
    /* language */ String | js.Array[String], 
    FilterCallback[Any, Any, Literal | js.Array[Literal]]
  ] = js.native
  inline def taggedLiteral(language: String): FilterCallback[Any, Any, Literal | js.Array[Literal]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedLiteral")(language.asInstanceOf[js.Any]).asInstanceOf[FilterCallback[Any, Any, Literal | js.Array[Literal]]]
  inline def taggedLiteral(language: js.Array[String]): FilterCallback[Any, Any, Literal | js.Array[Literal]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedLiteral")(language.asInstanceOf[js.Any]).asInstanceOf[FilterCallback[Any, Any, Literal | js.Array[Literal]]]
  inline def taggedLiteral_=(
    x: js.Function1[
      /* language */ String | js.Array[String], 
      FilterCallback[Any, Any, Literal | js.Array[Literal]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("taggedLiteral")(x.asInstanceOf[js.Any])
}
