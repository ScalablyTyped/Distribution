package typings.bowser

import typings.bowser.mod.Parser.ParsedResult
import typings.bowser.mod.Parser.Parser
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Bowser {
    
    @JSGlobal("Bowser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constants exposed via bowser getters
      */
    @JSGlobal("Bowser.BROWSER_MAP")
    @js.native
    val BROWSER_MAP: Record[String, String] = js.native
    
    @JSGlobal("Bowser.ENGINE_MAP")
    @js.native
    val ENGINE_MAP: Record[String, String] = js.native
    
    @JSGlobal("Bowser.OS_MAP")
    @js.native
    val OS_MAP: Record[String, String] = js.native
    
    @JSGlobal("Bowser.PLATFORMS_MAP")
    @js.native
    val PLATFORMS_MAP: Record[String, String] = js.native
    
    /**
      * Creates a Parser instance
      * @param {string} UA - User agent string
      * @param {boolean} skipParsing
      */
    inline def getParser(UA: String): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("getParser")(UA.asInstanceOf[js.Any]).asInstanceOf[Parser]
    inline def getParser(UA: String, skipParsing: Boolean): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("getParser")(UA.asInstanceOf[js.Any], skipParsing.asInstanceOf[js.Any])).asInstanceOf[Parser]
    
    /**
      * Creates a Parser instance and runs Parser.getResult immediately
      * @param UA - User agent string
      * @returns {Parser.ParsedResult}
      */
    inline def parse(UA: String): ParsedResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(UA.asInstanceOf[js.Any]).asInstanceOf[ParsedResult]
  }
}
