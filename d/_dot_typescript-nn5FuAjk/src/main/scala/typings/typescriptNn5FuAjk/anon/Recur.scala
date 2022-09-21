package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.FlatArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recur[Arr, Depth /* <: Double */] extends StObject {
  
  var done: Arr
  
  var recur: Arr | (FlatArray[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][Depth] */ js.Any
  ])
}
object Recur {
  
  inline def apply[Arr, Depth /* <: Double */](
    done: Arr,
    recur: Arr | (FlatArray[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][Depth] */ js.Any
    ])
  ): Recur[Arr, Depth] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recur[Arr, Depth]]
  }
  
  extension [Self <: Recur[?, ?], Arr, Depth /* <: Double */](x: Self & (Recur[Arr, Depth])) {
    
    inline def setDone(value: Arr): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setRecur(
      value: Arr | (FlatArray[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][Depth] */ js.Any
        ])
    ): Self = StObject.set(x, "recur", value.asInstanceOf[js.Any])
  }
}
