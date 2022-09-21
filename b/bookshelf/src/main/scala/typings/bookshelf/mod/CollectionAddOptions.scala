package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionAddOptions
  extends StObject
     with EventOptions {
  
  var at: js.UndefOr[Double] = js.undefined
  
  var merge: js.UndefOr[Boolean] = js.undefined
}
object CollectionAddOptions {
  
  inline def apply(): CollectionAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionAddOptions]
  }
  
  extension [Self <: CollectionAddOptions](x: Self) {
    
    inline def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
