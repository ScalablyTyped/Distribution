package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictoption
  extends /* key */ StringDictionary[js.Any] {
  
  var `class`: js.UndefOr[String] = js.native
}
object Dictoption {
  
  @scala.inline
  def apply(): Dictoption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictoption]
  }
  
  @scala.inline
  implicit class DictoptionMutableBuilder[Self <: Dictoption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
  }
}
