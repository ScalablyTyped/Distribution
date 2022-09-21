package typings.compressBrotli

import typings.node.zlibMod.InputType
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CompressResult = js.Promise[
/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<node.zlib.CompressCallback>[1] */ js.Any]

type DecompressResult = js.Promise[ReturnType[js.Function1[/* s */ String, Any]]]

type Deserialize[T] = js.Function1[/* source */ CompressResult, T]

type Serialize[T] = js.Function1[/* source */ InputType, T]
