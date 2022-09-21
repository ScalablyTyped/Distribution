package typings.cytoscape

import typings.cytoscape.mod.Core
import typings.cytoscape.mod.CytoscapeOptions
import typings.cytoscape.mod.Ext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object cytoscape {
    
    inline def apply(): Core = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Core]
    inline def apply(options: CytoscapeOptions): Core = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Core]
    inline def apply(`type`: String, name: String): Any = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(`type`: String, name: String, registrant: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], registrant.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("cytoscape")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Register imported extension into cytoscape
      * @param module Entry point for the extension, got by module = require('cy-ext')
      * or by import module from 'cy-ext'
      * http://js.cytoscape.org/#extensions
      */
    inline def use(module: Ext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(module.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Surpress Cytoscape internal warnings globally with a flag.
      * @param condition If true, all Cytoscape warnings are surpressed.
      * https://js.cytoscape.org/#core/initialisation
      */
    inline def warnings(condition: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnings")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
