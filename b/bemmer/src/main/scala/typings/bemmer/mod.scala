package typings.bemmer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bemmer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def create(classnames: String*): Builder = js.native
  
  def createBuilder(classnames: String*): Builder = js.native
  
  def isBuilder(target: js.Any): /* is bemmer.bemmer.Builder */ Boolean = js.native
  
  type Builder = js.Function2[
    /* classname */ js.UndefOr[String], 
    /* modifiers */ js.UndefOr[StringDictionary[js.Any]], 
    String
  ]
}
