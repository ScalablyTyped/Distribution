package typings.bizcharts.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * @example
    * // 数组形式: [ [ 'M', 100, 100 ], [ 'L', 200, 200 ] ]
    * // 字符串形式: M 100,100 L 200,200
    * @type {(string | any[])}
    */
  var path: js.UndefOr[String | js.Array[Any]] = js.undefined
}
object Path {
  
  inline def apply(): Path = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String | js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
