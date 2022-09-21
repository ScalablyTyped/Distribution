package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to read File or Blob objects in a synchronous way. */
@js.native
trait FileReaderSync extends StObject {
  
  def readAsArrayBuffer(blob: Blob): ArrayBuffer = js.native
  
  /** @deprecated */
  def readAsBinaryString(blob: Blob): java.lang.String = js.native
  
  def readAsDataURL(blob: Blob): java.lang.String = js.native
  
  def readAsText(blob: Blob): java.lang.String = js.native
  def readAsText(blob: Blob, encoding: java.lang.String): java.lang.String = js.native
}
