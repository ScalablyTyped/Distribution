package typings.browserfs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opts extends StObject {
  
  var opts: Root
}
object Opts {
  
  @scala.inline
  def apply(opts: Root): Opts = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
  
  @scala.inline
  implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpts(value: Root): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
  }
}
