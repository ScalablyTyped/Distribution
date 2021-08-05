package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexBot extends StObject {
  
  /**
    * The Region the Amazon Lex bot was created in.
    */
  var LexRegion: js.UndefOr[typings.awsSdk.connectMod.LexRegion] = js.undefined
  
  /**
    * The name of the Amazon Lex bot.
    */
  var Name: js.UndefOr[BotName] = js.undefined
}
object LexBot {
  
  inline def apply(): LexBot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexBot]
  }
  
  extension [Self <: LexBot](x: Self) {
    
    inline def setLexRegion(value: LexRegion): Self = StObject.set(x, "LexRegion", value.asInstanceOf[js.Any])
    
    inline def setLexRegionUndefined: Self = StObject.set(x, "LexRegion", js.undefined)
    
    inline def setName(value: BotName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
