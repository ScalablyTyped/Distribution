package typings.desktopService

import typings.desktopService.desktopServiceStrings.alreadyinstalled
import typings.desktopService.desktopServiceStrings.error
import typings.desktopService.desktopServiceStrings.install
import typings.desktopService.desktopServiceStrings.invalidinstallation
import typings.desktopService.desktopServiceStrings.start
import typings.desktopService.desktopServiceStrings.stop
import typings.desktopService.desktopServiceStrings.uninstall
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("desktop-service", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Service {
    def this(options: ServiceConfigOptions) = this()
  }
  
  trait EnvironmentVariables extends StObject {
    
    var name: String
    
    var value: Any
  }
  object EnvironmentVariables {
    
    inline def apply(name: String, value: Any): EnvironmentVariables = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentVariables]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnvironmentVariables] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Service extends EventEmitter {
    
    /**
      * Setting this to `true` will force the process to exit if it encounters
      * an error that stops the node.js script from running.
      * This does not mean the process will stop if the script throws an error.
      * It will only abort if the script throws an error causing the process to exit
      * (i.e. `process.exit(1)`).
      */
    var abortOnError: Boolean = js.native
    
    /** Description of the service. */
    var description: String = js.native
    
    /**
      * A number between 0-1 representing the percentage growth rate for the `wait` interval.
      * Setting this to anything other than `0` allows the process to increase it's wait period
      * on every restart attempt. If a process dies fatally, this will prevent the server from
      * restarting the process too rapidly (and too strenuously).
      */
    var grow: Double = js.native
    
    /** Install the script as a service. */
    def install(): Unit = js.native
    
    /**
      * The maximum number of restarts within a 60 second period before halting the process.
      * This cannot be disabled, but it can be rendered ineffective by setting a value of `0`.
      */
    var maxRestarts: Double = js.native
    
    /**
      * The maximum number of restart attempts to make before the service is considered
      * non-responsive/faulty. Ignored by default.
      */
    var maxRetries: Double = js.native
    
    /** The name of the service. */
    var name: String = js.native
    
    def on(
      event: install | alreadyinstalled | invalidinstallation | uninstall | start | stop,
      listener: js.Function0[Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    /** Restart the service. */
    def restart(): Unit = js.native
    
    /** The absolute path of the script to launch as a service. */
    var script: String = js.native
    
    /** Start and/or create the service. */
    def start(): Unit = js.native
    
    /** Stop the service if it is currently running. */
    def stop(): Unit = js.native
    
    /** Uninstall an existing service */
    def uninstall(): Unit = js.native
    
    /**
      * The initial number of seconds to wait before attempting a restart
      * (after the script stops).
      */
    @JSName("wait")
    var wait_FService: Double = js.native
  }
  
  trait ServiceConfigOptions extends StObject {
    
    /**
      * Setting this to `true` will force the process to exit if it encounters
      * an error that stops the node.js script from running.
      * This does not mean the process will stop if the script throws an error.
      * It will only abort if the script throws an error causing the process to exit
      * (i.e. `process.exit(1)`).
      */
    var abortOnError: js.UndefOr[Boolean] = js.undefined
    
    /** Description of the service. */
    var description: String
    
    var env: js.UndefOr[EnvironmentVariables | js.Array[EnvironmentVariables]] = js.undefined
    
    /**
      * A number between 0-1 representing the percentage growth rate for the `wait` interval.
      * Setting this to anything other than `0` allows the process to increase it's wait period
      * on every restart attempt. If a process dies fatally, this will prevent the server from
      * restarting the process too rapidly (and too strenuously).
      */
    var grow: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of restarts within a 60 second period before halting the process.
      * This cannot be disabled, but it can be rendered ineffective by setting a value of `0`.
      */
    var maxRestarts: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of restart attempts to make before the service is considered
      * non-responsive/faulty. Ignored by default.
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /** The name of the service. */
    var name: String
    
    /** The absolute path of the script to launch as a service. */
    var script: String
    
    /**
      * The initial number of seconds to wait before attempting a restart
      * (after the script stops).
      */
    @JSName("wait")
    var wait_FServiceConfigOptions: js.UndefOr[Double] = js.undefined
  }
  object ServiceConfigOptions {
    
    inline def apply(description: String, name: String, script: String): ServiceConfigOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAbortOnError(value: Boolean): Self = StObject.set(x, "abortOnError", value.asInstanceOf[js.Any])
      
      inline def setAbortOnErrorUndefined: Self = StObject.set(x, "abortOnError", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: EnvironmentVariables | js.Array[EnvironmentVariables]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEnvVarargs(value: EnvironmentVariables*): Self = StObject.set(x, "env", js.Array(value*))
      
      inline def setGrow(value: Double): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
      
      inline def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
      
      inline def setMaxRestarts(value: Double): Self = StObject.set(x, "maxRestarts", value.asInstanceOf[js.Any])
      
      inline def setMaxRestartsUndefined: Self = StObject.set(x, "maxRestarts", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
