package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeOptions extends StObject {
  
  var merger: js.UndefOr[
    js.Function4[
      /* key */ String, 
      /* target */ AnyObject, 
      /* source */ AnyObject, 
      /* options */ js.UndefOr[AnyObject], 
      Unit
    ]
  ] = js.undefined
}
object MergeOptions {
  
  inline def apply(): MergeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeOptions]
  }
  
  extension [Self <: MergeOptions](x: Self) {
    
    inline def setMerger(
      value: (/* key */ String, /* target */ AnyObject, /* source */ AnyObject, /* options */ js.UndefOr[AnyObject]) => Unit
    ): Self = StObject.set(x, "merger", js.Any.fromFunction4(value))
    
    inline def setMergerUndefined: Self = StObject.set(x, "merger", js.undefined)
  }
}
