package typings.createReactClass

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def createReactClass[P, S](spec: ComponentSpec[P, S]): ClassicComponentClass[P] = js.Dynamic.global.applyDynamic("createReactClass")(spec.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
}
