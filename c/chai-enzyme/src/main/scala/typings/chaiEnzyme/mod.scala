package typings.chaiEnzyme

import typings.chai.Chai.ChaiPlugin
import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ChaiPlugin]
  inline def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply(wrapper.asInstanceOf[js.Any]).asInstanceOf[ChaiPlugin]
  
  @JSImport("chai-enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DebugWrapper = (ShallowWrapper[Any, Any, Component[js.Object, js.Object, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Cheerio */ Any) | (ReactWrapper[Any, Any, Component[js.Object, js.Object, Any]])
}
