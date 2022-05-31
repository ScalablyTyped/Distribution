package typings.clampJs

import typings.clampJs.mod.ClampOptions
import typings.clampJs.mod.ClampResponse
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def clamp(element: HTMLElement): ClampResponse = js.Dynamic.global.applyDynamic("clamp")(element.asInstanceOf[js.Any]).asInstanceOf[ClampResponse]
  inline def clamp(element: HTMLElement, options: ClampOptions): ClampResponse = (js.Dynamic.global.applyDynamic("clamp")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClampResponse]
}
