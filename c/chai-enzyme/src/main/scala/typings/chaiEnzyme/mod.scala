package typings.chaiEnzyme

import typings.chai.Chai.ChaiPlugin
import typings.cheerio.cheerio.Cheerio
import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ChaiPlugin]
  @scala.inline
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply(wrapper.asInstanceOf[js.Any]).asInstanceOf[ChaiPlugin]
  
  @JSImport("chai-enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]) | Cheerio | (ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]])
}
