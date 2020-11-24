package typings.bagpipes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Fitting = js.Function2[
    /* context */ typings.bagpipes.mod.FittingContext, 
    /* next */ js.Function2[
      /* err */ js.UndefOr[typings.std.Error | scala.Null], 
      /* res */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type FittingFactory = js.Function2[
    /* fittingDef */ typings.bagpipes.mod.FittingDef, 
    /* bagpipes */ js.Any, 
    typings.bagpipes.mod.Fitting
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bagpipes.bagpipesStrings.system
    - typings.bagpipes.bagpipesStrings.user
    - java.lang.String
  */
  type FittingType = typings.bagpipes.mod._FittingType | java.lang.String
  
  type FittingTypesMap = org.scalablytyped.runtime.StringDictionary[typings.bagpipes.mod.FittingFactory]
  
  type PipeDef = js.Array[js.Any] | java.lang.String | typings.bagpipes.mod.FittingDef
  
  type PipeDefMap = org.scalablytyped.runtime.StringDictionary[typings.bagpipes.mod.PipeDef]
}
