package typings.binaryParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Parser {
  
  type Data = scala.Double | java.lang.String | (js.Array[scala.Double | typings.binaryParser.mod.Parser[js.Any]]) | typings.binaryParser.mod.Parser[js.Any] | typings.node.Buffer
  
  type Next[O /* <: js.UndefOr[js.Object] */, N /* <: java.lang.String */, T /* <: js.Any */] = typings.binaryParser.mod.Parser[
    typings.binaryParser.mod.Parser.Valid[
      O, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: T}
    */ typings.binaryParser.binaryParserStrings.Next with org.scalablytyped.runtime.TopLevel[js.Any]
    ]
  ]
  
  type Parsed[O /* <: js.UndefOr[js.Object] */] = O | js.Object
  
  type Valid[O /* <: js.UndefOr[js.Object] */, P /* <: js.Object */] = (O with P) | P
}
