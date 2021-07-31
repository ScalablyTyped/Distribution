package typings.backbonePaginator

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbonePaginator.mod.PageableCollection
import typings.backbonePaginator.mod.PageableInitialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofPageableCollection
    extends StObject
       with Instantiable0[PageableCollection[Model[js.Any, ModelSetOptions, js.Object]]]
       with Instantiable1[
          /* models */ js.Array[/* import warning: RewrittenClass.unapply cls was tparam TModel */ js.Any], 
          PageableCollection[Model[js.Any, ModelSetOptions, js.Object]]
        ]
       with Instantiable2[
          (/* models */ js.Array[/* import warning: RewrittenClass.unapply cls was tparam TModel */ js.Any]) | (/* models */ Unit), 
          /* options */ PageableInitialOptions, 
          PageableCollection[Model[js.Any, ModelSetOptions, js.Object]]
        ] {
    
    def noConflict(): /* import warning: importer.ImportType#apply Failed type conversion: typeof PageableCollection */ js.Any = js.native
  }
}
