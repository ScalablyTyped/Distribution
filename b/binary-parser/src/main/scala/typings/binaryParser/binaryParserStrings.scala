package typings.binaryParser

import typings.binaryParser.mod.Parser.Endianness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryParserStrings {
  
  @js.native
  sealed trait Next extends StObject
  inline def Next: Next = "Next".asInstanceOf[Next]
  
  @js.native
  sealed trait big
    extends StObject
       with Endianness
  inline def big: big = "big".asInstanceOf[big]
  
  @js.native
  sealed trait little
    extends StObject
       with Endianness
  inline def little: little = "little".asInstanceOf[little]
}
