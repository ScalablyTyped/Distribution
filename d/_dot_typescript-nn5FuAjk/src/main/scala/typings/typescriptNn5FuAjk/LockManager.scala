package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait LockManager extends StObject {
  
  def query(): Promise[LockManagerSnapshot] = js.native
  
  def request(name: java.lang.String, callback: LockGrantedCallback): Promise[Any] = js.native
  def request(name: java.lang.String, options: LockOptions, callback: LockGrantedCallback): Promise[Any] = js.native
}
