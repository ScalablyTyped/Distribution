package typings.bemmer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bemmer", "create")
  @js.native
  def create(classnames: String*): Builder = js.native
  
  @JSImport("bemmer", "createBuilder")
  @js.native
  def createBuilder(classnames: String*): Builder = js.native
  
  @JSImport("bemmer", "isBuilder")
  @js.native
  def isBuilder(target: js.Any): /* is bemmer.bemmer.Builder */ Boolean = js.native
  
  type Builder = js.Function2[
    /* classname */ js.UndefOr[String], 
    /* modifiers */ js.UndefOr[StringDictionary[js.Any]], 
    String
  ]
}
