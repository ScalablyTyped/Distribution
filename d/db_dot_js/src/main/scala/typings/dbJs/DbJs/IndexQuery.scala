package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexQuery[T] extends Query[T] {
  
  def all(): Query[T] = js.native
  
  def bound(lowerBound: Any, upperBound: Any): Query[T] = js.native
  
  def lowerBound(lowerBound: Any): Query[T] = js.native
  
  def only(args: Any*): Query[T] = js.native
  
  def range(opts: Any): Query[T] = js.native
  
  def upperBound(upperBound: Any): Query[T] = js.native
}
