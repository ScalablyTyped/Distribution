package typings.blueprintjsIcons

import typings.blueprintjsIcons.camelCaseMod.CamelCase
import typings.std.Capitalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pascalCaseMod {
  
  type PascalCase[Value] = CamelCase[Value] | Capitalize[CamelCase[Value]]
}
