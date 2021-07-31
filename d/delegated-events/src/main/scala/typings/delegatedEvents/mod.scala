package typings.delegatedEvents

import typings.delegatedEvents.anon.CurrentTarget
import typings.delegatedEvents.anon.CustomEventanycurrentTarg
import typings.delegatedEvents.delegatedEventsStrings.abort
import typings.delegatedEvents.delegatedEventsStrings.animationcancel
import typings.delegatedEvents.delegatedEventsStrings.animationend
import typings.delegatedEvents.delegatedEventsStrings.animationiteration
import typings.delegatedEvents.delegatedEventsStrings.animationstart
import typings.delegatedEvents.delegatedEventsStrings.auxclick
import typings.delegatedEvents.delegatedEventsStrings.blur
import typings.delegatedEvents.delegatedEventsStrings.cancel
import typings.delegatedEvents.delegatedEventsStrings.canplay
import typings.delegatedEvents.delegatedEventsStrings.canplaythrough
import typings.delegatedEvents.delegatedEventsStrings.change
import typings.delegatedEvents.delegatedEventsStrings.click
import typings.delegatedEvents.delegatedEventsStrings.close
import typings.delegatedEvents.delegatedEventsStrings.contextmenu
import typings.delegatedEvents.delegatedEventsStrings.cuechange
import typings.delegatedEvents.delegatedEventsStrings.dblclick
import typings.delegatedEvents.delegatedEventsStrings.drag
import typings.delegatedEvents.delegatedEventsStrings.dragend
import typings.delegatedEvents.delegatedEventsStrings.dragenter
import typings.delegatedEvents.delegatedEventsStrings.dragexit
import typings.delegatedEvents.delegatedEventsStrings.dragleave
import typings.delegatedEvents.delegatedEventsStrings.dragover
import typings.delegatedEvents.delegatedEventsStrings.dragstart
import typings.delegatedEvents.delegatedEventsStrings.drop
import typings.delegatedEvents.delegatedEventsStrings.durationchange
import typings.delegatedEvents.delegatedEventsStrings.emptied
import typings.delegatedEvents.delegatedEventsStrings.ended
import typings.delegatedEvents.delegatedEventsStrings.error
import typings.delegatedEvents.delegatedEventsStrings.focus
import typings.delegatedEvents.delegatedEventsStrings.focusin
import typings.delegatedEvents.delegatedEventsStrings.focusout
import typings.delegatedEvents.delegatedEventsStrings.gotpointercapture
import typings.delegatedEvents.delegatedEventsStrings.input
import typings.delegatedEvents.delegatedEventsStrings.invalid
import typings.delegatedEvents.delegatedEventsStrings.keydown
import typings.delegatedEvents.delegatedEventsStrings.keypress
import typings.delegatedEvents.delegatedEventsStrings.keyup
import typings.delegatedEvents.delegatedEventsStrings.load
import typings.delegatedEvents.delegatedEventsStrings.loadeddata
import typings.delegatedEvents.delegatedEventsStrings.loadedmetadata
import typings.delegatedEvents.delegatedEventsStrings.loadstart
import typings.delegatedEvents.delegatedEventsStrings.lostpointercapture
import typings.delegatedEvents.delegatedEventsStrings.mousedown
import typings.delegatedEvents.delegatedEventsStrings.mouseenter
import typings.delegatedEvents.delegatedEventsStrings.mouseleave
import typings.delegatedEvents.delegatedEventsStrings.mousemove
import typings.delegatedEvents.delegatedEventsStrings.mouseout
import typings.delegatedEvents.delegatedEventsStrings.mouseover
import typings.delegatedEvents.delegatedEventsStrings.mouseup
import typings.delegatedEvents.delegatedEventsStrings.pause
import typings.delegatedEvents.delegatedEventsStrings.play
import typings.delegatedEvents.delegatedEventsStrings.playing
import typings.delegatedEvents.delegatedEventsStrings.pointercancel
import typings.delegatedEvents.delegatedEventsStrings.pointerdown
import typings.delegatedEvents.delegatedEventsStrings.pointerenter
import typings.delegatedEvents.delegatedEventsStrings.pointerleave
import typings.delegatedEvents.delegatedEventsStrings.pointermove
import typings.delegatedEvents.delegatedEventsStrings.pointerout
import typings.delegatedEvents.delegatedEventsStrings.pointerover
import typings.delegatedEvents.delegatedEventsStrings.pointerup
import typings.delegatedEvents.delegatedEventsStrings.progress
import typings.delegatedEvents.delegatedEventsStrings.ratechange
import typings.delegatedEvents.delegatedEventsStrings.reset
import typings.delegatedEvents.delegatedEventsStrings.resize
import typings.delegatedEvents.delegatedEventsStrings.scroll
import typings.delegatedEvents.delegatedEventsStrings.securitypolicyviolation
import typings.delegatedEvents.delegatedEventsStrings.seeked
import typings.delegatedEvents.delegatedEventsStrings.seeking
import typings.delegatedEvents.delegatedEventsStrings.select
import typings.delegatedEvents.delegatedEventsStrings.selectionchange
import typings.delegatedEvents.delegatedEventsStrings.selectstart
import typings.delegatedEvents.delegatedEventsStrings.stalled
import typings.delegatedEvents.delegatedEventsStrings.submit
import typings.delegatedEvents.delegatedEventsStrings.suspend
import typings.delegatedEvents.delegatedEventsStrings.timeupdate
import typings.delegatedEvents.delegatedEventsStrings.toggle
import typings.delegatedEvents.delegatedEventsStrings.touchcancel
import typings.delegatedEvents.delegatedEventsStrings.touchend
import typings.delegatedEvents.delegatedEventsStrings.touchmove
import typings.delegatedEvents.delegatedEventsStrings.touchstart
import typings.delegatedEvents.delegatedEventsStrings.transitioncancel
import typings.delegatedEvents.delegatedEventsStrings.transitionend
import typings.delegatedEvents.delegatedEventsStrings.transitionrun
import typings.delegatedEvents.delegatedEventsStrings.transitionstart
import typings.delegatedEvents.delegatedEventsStrings.volumechange
import typings.delegatedEvents.delegatedEventsStrings.waiting
import typings.delegatedEvents.delegatedEventsStrings.wheel
import typings.std.AnimationEvent
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.GlobalEventHandlers
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delegated-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fire(target: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def fire(target: Element, name: String, detail: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def off(name: String, selector: String, listener: DelegatedEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on(name: String, selector: String, listener: DelegatedEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ ErrorEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ ErrorEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FocusEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ MouseEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ PointerEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ ProgressEvent[EventTarget] & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ ProgressEvent[EventTarget] & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ SecurityPolicyViolationEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ SecurityPolicyViolationEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TouchEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, js.Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ WheelEvent & CurrentTarget, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ WheelEvent & CurrentTarget, 
      js.Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DelegatedEventListener = js.ThisFunction1[/* this */ Element, /* ev */ CustomEventanycurrentTarg, js.Any]
}
