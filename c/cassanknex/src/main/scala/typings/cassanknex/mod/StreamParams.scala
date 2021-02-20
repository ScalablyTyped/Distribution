package typings.cassanknex.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamParams extends StObject {
  
  def end(): js.Any = js.native
  
  def error(err: Error): js.Any = js.native
  
  def readable(): js.Any = js.native
}
object StreamParams {
  
  @scala.inline
  def apply(end: () => js.Any, error: Error => js.Any, readable: () => js.Any): StreamParams = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
    __obj.asInstanceOf[StreamParams]
  }
  
  @scala.inline
  implicit class StreamParamsMutableBuilder[Self <: StreamParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: Error => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadable(value: () => js.Any): Self = StObject.set(x, "readable", js.Any.fromFunction0(value))
  }
}
