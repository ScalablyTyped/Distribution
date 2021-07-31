package typings.cliSpinner

import typings.cliSpinner.anon.TypeofSpinner
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-spinner", "Spinner")
  @js.native
  class Spinner () extends StObject {
    def this(titleOrOptions: String) = this()
    def this(titleOrOptions: Options) = this()
    
    def clearLine(stream: WritableStream): this.type = js.native
    
    def isSpinning(): Boolean = js.native
    
    def setSpinnerDelay(spinnerDelay: Double): this.type = js.native
    
    def setSpinnerString(spinnerString: String): this.type = js.native
    def setSpinnerString(spinnerString: Double): this.type = js.native
    
    def setSpinnerTitle(title: String): this.type = js.native
    
    def start(): this.type = js.native
    
    def stop(): this.type = js.native
    def stop(clear: Boolean): this.type = js.native
    
    val stream: WritableStream = js.native
  }
  /* static members */
  object Spinner {
    
    @JSImport("cli-spinner", "Spinner")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def setDefaultSpinnerDelay(spinnerDelay: Double): TypeofSpinner = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSpinnerDelay")(spinnerDelay.asInstanceOf[js.Any]).asInstanceOf[TypeofSpinner]
    
    @scala.inline
    def setDefaultSpinnerString(spinnerString: String): TypeofSpinner = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSpinnerString")(spinnerString.asInstanceOf[js.Any]).asInstanceOf[TypeofSpinner]
    @scala.inline
    def setDefaultSpinnerString(spinnerString: Double): TypeofSpinner = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSpinnerString")(spinnerString.asInstanceOf[js.Any]).asInstanceOf[TypeofSpinner]
  }
  
  trait Options extends StObject {
    
    var onTick: js.UndefOr[js.ThisFunction1[/* this */ Spinner, /* msg */ String, Unit]] = js.undefined
    
    var stream: js.UndefOr[WritableStream] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTick(value: js.ThisFunction1[/* this */ Spinner, /* msg */ String, Unit]): Self = StObject.set(x, "onTick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTickUndefined: Self = StObject.set(x, "onTick", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
