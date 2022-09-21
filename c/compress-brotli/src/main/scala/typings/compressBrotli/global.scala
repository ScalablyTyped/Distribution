package typings.compressBrotli

import typings.compressBrotli.anon.Compress
import typings.compressBrotli.anon.CompressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object createCompress {
    
    inline def apply[SerializeResult, DeserializeResult](): Compress[SerializeResult, DeserializeResult] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Compress[SerializeResult, DeserializeResult]]
    inline def apply[SerializeResult, DeserializeResult](options: CompressOptions[SerializeResult, DeserializeResult]): Compress[SerializeResult, DeserializeResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Compress[SerializeResult, DeserializeResult]]
    
    @JSGlobal("createCompress")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof JSONBparse` */
    inline def parse(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* was `typeof JSONBstringify` */
    inline def stringify(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
