package typings.codemirrorView.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Key bindings associate key names with
[command](https://codemirror.net/6/docs/ref/#view.Command)-style functions.
Key names may be strings like `"Shift-Ctrl-Enter"`—a key identifier
prefixed with zero or more modifiers. Key identifiers are based on
the strings that can appear in
[`KeyEvent.key`](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key).
Use lowercase letters to refer to letter keys (or uppercase letters
if you want shift to be held). You may use `"Space"` as an alias
for the `" "` name.
Modifiers can be given in any order. `Shift-` (or `s-`), `Alt-` (or
`a-`), `Ctrl-` (or `c-` or `Control-`) and `Cmd-` (or `m-` or
`Meta-`) are recognized.
When a key binding contains multiple key names separated by
spaces, it represents a multi-stroke binding, which will fire when
the user presses the given keys after each other.
You can use `Mod-` as a shorthand for `Cmd-` on Mac and `Ctrl-` on
other platforms. So `Mod-b` is `Ctrl-b` on Linux but `Cmd-b` on
macOS.
*/
trait KeyBinding extends StObject {
  
  /**
    When this property is present, the function is called for every
    key that is not a multi-stroke prefix.
    */
  var any: js.UndefOr[js.Function2[/* view */ EditorView, /* event */ KeyboardEvent, Boolean]] = js.undefined
  
  /**
    The key name to use for this binding. If the platform-specific
    property (`mac`, `win`, or `linux`) for the current platform is
    used as well in the binding, that one takes precedence. If `key`
    isn't defined and the platform-specific binding isn't either,
    a binding is ignored.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    Key to use specifically on Linux.
    */
  var linux: js.UndefOr[String] = js.undefined
  
  /**
    Key to use specifically on macOS.
    */
  var mac: js.UndefOr[String] = js.undefined
  
  /**
    When set to true (the default is false), this will always
    prevent the further handling for the bound key, even if the
    command(s) return false. This can be useful for cases where the
    native behavior of the key is annoying or irrelevant but the
    command doesn't always apply (such as, Mod-u for undo selection,
    which would cause the browser to view source instead when no
    selection can be undone).
    */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    The command to execute when this binding is triggered. When the
    command function returns `false`, further bindings will be tried
    for the key.
    */
  var run: js.UndefOr[Command] = js.undefined
  
  /**
    By default, key bindings apply when focus is on the editor
    content (the `"editor"` scope). Some extensions, mostly those
    that define their own panels, might want to allow you to
    register bindings local to that panel. Such bindings should use
    a custom scope name. You may also assign multiple scope names to
    a binding, separating them by spaces.
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    When given, this defines a second binding, using the (possibly
    platform-specific) key name prefixed with `Shift-` to activate
    this command.
    */
  var shift: js.UndefOr[Command] = js.undefined
  
  /**
    Key to use specifically on Windows.
    */
  var win: js.UndefOr[String] = js.undefined
}
object KeyBinding {
  
  inline def apply(): KeyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyBinding] (val x: Self) extends AnyVal {
    
    inline def setAny(value: (/* view */ EditorView, /* event */ KeyboardEvent) => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction2(value))
    
    inline def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLinux(value: String): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setRun(value: /* target */ EditorView => Boolean): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setShift(value: /* target */ EditorView => Boolean): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setWin(value: String): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    
    inline def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
  }
}
