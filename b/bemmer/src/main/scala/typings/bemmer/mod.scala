package typings.bemmer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bemmer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(classnames: String*): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(classnames.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  @scala.inline
  def createBuilder(classnames: String*): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(classnames.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  @scala.inline
  def isBuilder(target: js.Any): /* is bemmer.bemmer.Builder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuilder")(target.asInstanceOf[js.Any]).asInstanceOf[/* is bemmer.bemmer.Builder */ Boolean]
  
  type Builder = js.Function2[
    /* classname */ js.UndefOr[String], 
    /* modifiers */ js.UndefOr[StringDictionary[js.Any]], 
    String
  ]
}
