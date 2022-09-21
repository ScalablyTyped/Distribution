package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes.
  * @deprecated
  */
@js.native
trait MimeTypeArray
  extends StObject
     with /* index */ NumberDictionary[MimeType] {
  
  /** @deprecated */
  def item(index: Double): MimeType | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  
  /** @deprecated */
  val length: Double = js.native
  
  /** @deprecated */
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}
