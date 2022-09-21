package typings.dataframeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioMod {
  
  @JSImport("dataframe-js/io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fromCSV(pathOrFile: Any, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCSV")(pathOrFile.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def fromDSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fromDSV(pathOrFile: Any, sep: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fromDSV(pathOrFile: Any, sep: String, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fromDSV(pathOrFile: Any, sep: Unit, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def fromJSON(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def fromPSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fromPSV(pathOrFile: Any, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPSV")(pathOrFile.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def fromTSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fromTSV(pathOrFile: Any, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTSV")(pathOrFile.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def fromText(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fromText(pathOrFile: Any, sep: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fromText(pathOrFile: Any, sep: String, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fromText(pathOrFile: Any, sep: Unit, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def toCSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toCSV(df: Any, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toCSV(df: Any, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toCSV(df: Any, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toDSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toDSV(df: Any, sep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toDSV(df: Any, sep: String, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toDSV(df: Any, sep: String, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toDSV(df: Any, sep: String, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toDSV(df: Any, sep: Unit, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toDSV(df: Any, sep: Unit, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toDSV(df: Any, sep: Unit, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toJSON(df: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toJSON(df: Any, asCollection: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any], asCollection.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toJSON(df: Any, asCollection: Boolean, path: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any], asCollection.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toJSON(df: Any, asCollection: Unit, path: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any], asCollection.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toPSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toPSV(df: Any, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toPSV(df: Any, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toPSV(df: Any, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toTSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toTSV(df: Any, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toTSV(df: Any, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toTSV(df: Any, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toText(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toText(df: Any, sep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toText(df: Any, sep: String, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toText(df: Any, sep: String, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toText(df: Any, sep: String, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toText(df: Any, sep: Unit, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toText(df: Any, sep: Unit, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toText(df: Any, sep: Unit, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
}
