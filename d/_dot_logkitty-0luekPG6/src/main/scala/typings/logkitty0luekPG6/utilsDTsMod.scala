package typings.logkitty0luekPG6

import org.scalablytyped.runtime.StringDictionary
import typings.logkitty0luekPG6.anon.FromName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDTsMod {
  
  @JSImport(".logkitty-0luekPG6/build/utils.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMinPriority(Priority: FromName, priorities: StringDictionary[Boolean], defaultPriority: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinPriority")(Priority.asInstanceOf[js.Any], priorities.asInstanceOf[js.Any], defaultPriority.asInstanceOf[js.Any])).asInstanceOf[Double]
}
