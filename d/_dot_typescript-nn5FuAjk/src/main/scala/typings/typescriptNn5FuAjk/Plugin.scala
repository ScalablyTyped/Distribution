package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a browser plugin.
  * @deprecated
  */
@js.native
trait Plugin
  extends StObject
     with /* index */ NumberDictionary[MimeType] {
  
  /**
    * Returns the plugin's description.
    * @deprecated
    */
  val description: java.lang.String = js.native
  
  /**
    * Returns the plugin library's filename, if applicable on the current platform.
    * @deprecated
    */
  val filename: java.lang.String = js.native
  
  /**
    * Returns the specified MimeType object.
    * @deprecated
    */
  def item(index: Double): MimeType | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  
  /**
    * Returns the number of MIME types, represented by MimeType objects, supported by the plugin.
    * @deprecated
    */
  val length: Double = js.native
  
  /**
    * Returns the plugin's name.
    * @deprecated
    */
  val name: java.lang.String = js.native
  
  /** @deprecated */
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}
