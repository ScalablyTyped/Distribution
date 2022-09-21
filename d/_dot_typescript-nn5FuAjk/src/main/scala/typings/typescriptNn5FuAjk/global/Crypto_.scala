package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.ArrayBufferView
import typings.typescriptNn5FuAjk.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Crypto")
@js.native
open class Crypto_ ()
  extends StObject
     with Crypto {
  
  /* CompleteClass */
  override def getRandomValues[T /* <: ArrayBufferView | Null */](array: T): T = js.native
  
  /** Available only in secure contexts. */
  /* CompleteClass */
  override def randomUUID(): java.lang.String = js.native
  
  /** Available only in secure contexts. */
  /* CompleteClass */
  override val subtle: typings.typescriptNn5FuAjk.SubtleCrypto = js.native
}
