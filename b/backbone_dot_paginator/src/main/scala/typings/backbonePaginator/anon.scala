package typings.backbonePaginator

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbonePaginator.backboneMod.PageableCollection
import typings.backbonePaginator.backboneMod.PageableInitialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofPageableCollection
    extends StObject
       with Instantiable0[PageableCollection[Model[Any, ModelSetOptions, Any]]]
       with Instantiable1[
          /* models */ js.Array[/* import warning: RewrittenClass.unapply cls was tparam TModel */ Any], 
          PageableCollection[Model[Any, ModelSetOptions, Any]]
        ]
       with Instantiable2[
          (/* models */ js.Array[/* import warning: RewrittenClass.unapply cls was tparam TModel */ Any]) | (/* models */ Unit), 
          /* options */ PageableInitialOptions, 
          PageableCollection[Model[Any, ModelSetOptions, Any]]
        ] {
    
    def noConflict(): /* import warning: importer.ImportType#apply Failed type conversion: typeof PageableCollection */ js.Any = js.native
  }
}
